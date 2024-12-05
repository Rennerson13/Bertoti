<template>
 <v-container class="custom-background fill-height">
  <v-container class="fill-height">
    <v-responsive
      class="align-center fill-height mx-auto"
      max-width="900"
    >
      <v-container class="d-flex align-center pe-2">
        <h1>Jogadores do Galo</h1>
        <v-spacer />
        <v-btn class="ma-2" icon="mdi-plus-circle-outline" color="grey" size="large" @click="createAtleticoMineiro"></v-btn>
      </v-container>

      <v-data-table :items="atleticoMineiroList" :headers="headers">
        <template v-slot:item.actions="{ item }">
          <v-icon
            size="large"
            color="white"
            @click="editAtleticoMineiro(item)"
          >
            mdi-pencil
          </v-icon>
          <v-icon
            size="large"
            color="red"
            @click="deleteAtleticoMineiro(item)"
          >
            mdi-delete
          </v-icon>
        </template>
      </v-data-table>

      <v-dialog v-model="atleticoMineiroDialog">
        <v-card>
          <v-card-title class="text-h5">{{ (isUpdateMode ? "Edit" : "Create") + " " + "AtleticoMineiro" }}</v-card-title>
          <v-container>
            <v-text-field v-if="isUpdateMode" v-model="atleticoMineiro.id" disabled></v-text-field>
            <v-text-field v-model="atleticoMineiro.name" label="Name"></v-text-field>
          </v-container>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn color="primary" text @click="atleticoMineiroDialog = false">Cancel</v-btn>
            <v-btn color="success" text @click="saveAtleticoMineiro">Save</v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>

      <v-dialog v-model="atleticoMineiroDeleteDialog" max-width="500px">
        <v-card>
          <v-card-title class="text-h5 card">Are you sure that you want to delete 
            <span class="text-red text--darken-2">{{ this.atleticoMineiro.name }}</span>?
          </v-card-title>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn color="primary" variant="text" @click="atleticoMineiroDeleteDialog = false">Cancel</v-btn>
            <v-btn color="red" variant="text" @click="removeAtleticoMineiro">Delete</v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>

      <v-snackbar 
        v-model="snackbar.show"
        :timeout="3000"
        :color="snackbar.color"
        elevation="24"
      >
        {{ this.snackbar.message }}
      </v-snackbar>
    </v-responsive>
  </v-container>
 </v-container>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      atleticoMineiroIdx: -1,
      atleticoMineiro: {},
      atleticoMineiroList: [
        {
          id: '4636d367-876c-8274-6578-f938466fcd4',
          name: 'John Doe',
        }
      ],
      atleticoMineiroDialog: false,
      atleticoMineiroDeleteDialog: false,
      isUpdateMode: false,
      headers: [
        {title: "Id", key: "id"},
        {title: "Name", key: "name"},
        {title: "", key: "actions"}
      ],
      snackbar: {
        show: false,
        color: "green",
        message: ''
      }
    };
  },
  watch: {
    atleticoMineiroDialog() {
      if (!this.atleticoMineiroDialog) {
        this.resetAtleticoMineiro();
        this.isUpdateMode = false;
      }
    },
    atleticoMineiroDeleteDialog() {
      if (!this.atleticoMineiroDeleteDialog) {
        this.resetAtleticoMineiro();
      }
    }
  },
  mounted() {
    this.getAllAtleticoMineiro();
  },
  methods: {
    async getAllAtleticoMineiro() {
      try {
        const response = await axios.get('http://localhost:8080/atleticoMineiro');
        this.atleticoMineiroList = response.data;
      } catch (e) {
        console.error(`Error on getting all AtleticoMineiro (${e})`);
      }
    },
    editAtleticoMineiro(atleticoMineiro) {
      this.atleticoMineiroIdx = this.atleticoMineiroList.indexOf(atleticoMineiro);
      this.atleticoMineiro = { ...this.atleticoMineiroList[this.atleticoMineiroIdx] };
      this.isUpdateMode = true;
      this.atleticoMineiroDialog = true;
    },
    resetAtleticoMineiro() {
      this.atleticoMineiroIdx = -1;
      this.atleticoMineiro = {};
    },
    async saveAtleticoMineiro() {
      if (this.isUpdateMode) {
        try {
          await axios.put(`http://localhost:8080/atleticoMineiro/${this.atleticoMineiro.id}`, { name: this.atleticoMineiro.name });
          this.atleticoMineiroList[this.atleticoMineiroIdx] = this.atleticoMineiro;
          this.showSnackbar("AtleticoMineiro updated successfully", "green");
        } catch (e) {
          console.error(`Failed to edit AtleticoMineiro (${e})`);
          this.showSnackbar("Failed to update the AtleticoMineiro info", "red");
        }
      } else {
        try {
          const response = await axios.post("http://localhost:8080/atleticoMineiro", { name: this.atleticoMineiro.name });
          this.atleticoMineiroList.unshift(response.data);
          this.atleticoMineiro = response.data;
          this.showSnackbar("AtleticoMineiro saved successfully", "green");
          this.isUpdateMode = true;
        } catch (e) {
          console.error(`Failed to save AtleticoMineiro (${e})`);
          this.showSnackbar("Failed to save the AtleticoMineiro", "red");
        }
      }
    },
    createAtleticoMineiro() {
      this.atleticoMineiroDialog = true;
    },
    deleteAtleticoMineiro(atleticoMineiro) {
      this.atleticoMineiroIdx = this.atleticoMineiroList.indexOf(atleticoMineiro);
      this.atleticoMineiro = atleticoMineiro;
      this.atleticoMineiroDeleteDialog = true;
    },
    async removeAtleticoMineiro() {
      try {
        await axios.delete(`http://localhost:8080/atleticoMineiro/${this.atleticoMineiro.id}`);
        this.atleticoMineiroList.splice(this.atleticoMineiroIdx, 1);
        this.atleticoMineiroDeleteDialog = false;
        this.showSnackbar("AtleticoMineiro removed successfully", "green");
      } catch (e) {
        console.error(`Failed to delete AtleticoMineiro (${e})`);
        this.showSnackbar("Failed to remove the AtleticoMineiro", "red");
      }
    },
    showSnackbar(msg, color) {
      this.snackbar.message = msg;
      this.snackbar.color = color;
      this.snackbar.show = true;
    }
  }
};
</script>

<style scoped>
.card {
  white-space: normal;
}
</style>

<style scoped>
.custom-background {
  background-image: url('@/assets/galo.png'); 
  background-size: cover; 
  background-position: center; 
  background-repeat: no-repeat; 
  min-height: 100vh; 
  width: 100%; 
}
</style>
