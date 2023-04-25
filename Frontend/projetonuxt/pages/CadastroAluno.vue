<template>
    <div id="main-container">
        <CadastroAlunoForm />
    </div>
</template>
<script>
import Service from '@/service/EncontreService';
import CadastroAlunoForm from '../layouts/CadastroAlunoForm.vue';

export default {
name: "CadastroAluno",
components: {
    CadastroAlunoForm
  }
}

</script>
<style>

</style>