<template>
  <Banner />
  <div class="main-container">
    <QuemSomos />
    <ContatoForm />
  </div>
</template>

<script>
import Banner from "../components/Banner.vue";
import QuemSomos from "../components/QuemSomos.vue";
import ContatoForm from "../components/ContatoForm.vue";

export default {
  name: "Home",
  components: {
    Banner,
    QuemSomos,
    ContatoForm
  }
}
</script>

<style>
  
</style>
