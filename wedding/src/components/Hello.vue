<template>
 <div class="hello">
    <h1>{{ hellomsg }}</h1>
  </div>
</template>

<script>
export default {
  name: 'hello',
 props: { hellomsg: { type: String } }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  color: red;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}

</style>