<template>
  <div class="guests">
    <h2>Just some database interaction...</h2>
    <button @click="retrieveGuests()">Click to view your Guests</button>

      <table class="tList">
        <thead>
          <tr>
            <th>
              Name
            </th>
            <th class="ttd2">
              Guest Count
            </th>
          </tr>
        </thead>
        <tbody class="tListBody">
          <tr v-for="(table, index) in tables">
            <td>{{ index }}</td>
            <td class="ttd1">{{ table.people.firstName }}, {{ guest.firstName }}</td>
          </tr>
        </tbody>
      </table>

      <button @click="reset()">Reset</button>
  </div>
</template>

<script>
// import axios from 'axios'
import { AXIOS } from "./../http-common";

export default {
  name: "guests",
  data() {
    return {
      response: [],
      guest: {
        lastName: "",
        firstName: "",
        id: 0
      },
      retrievedGuests: {},
      showRetrievedGuests: false
    };
  },
  methods: {
    // Fetches guests
    retrieveGuests() {
      AXIOS.get(`/guest/all/`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.retrievedGuests = response.data;
          console.log(response.data);
          this.showRetrievedGuests = true;
        })
        .catch(e => {
          this.errors.push(e);
        });
    },
    reset() {
      this.showRetrievedGuests = false;
    }
  }
};
</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
  color: #8a09f3;
}

a {
  color: #42b983;
}

table.gList {
  margin-left: auto;
  margin-right: auto;
  border-collapse: collapse;
}

tbody.gListBody {
  text-align: left;
}

tr:nth-child(odd) {
  background-color: #42b3f4;
}

td.gltd2
{
  border-left: 2px solid white;
}

th.gltd2
{
  border-left: 2px solid white;
}

table.gList th:first-child{
  border-radius:10px 0 0 0px;
}
table.gList th:last-child{
  border-radius:0 10px 0px 0;
}
</style>
