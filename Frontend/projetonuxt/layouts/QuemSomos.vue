<template>
    <div id="main-container">
        <div id="main-quemsomos">
            <h1>QUEM SOMOS</h1>
            <p>
                Encontre Sua Matéria é um site de aulas de reforço que tem como objetivo ajudar 
                estudantes de todas as idades a melhorar seu desempenho acadêmico. O site oferece 
                aulas particulares em diversas matérias, desde as mais básicas, como matemática e português, 
                até as mais avançadas, como física e química.
            </p>
            <p>
                Ao acessar o site, o usuário pode escolher a matéria em que precisa de ajuda e encontrar 
                um professor qualificado para ministrar as aulas. O processo de seleção dos professores é 
                rigoroso, garantindo que apenas os melhores profissionais estejam disponíveis para os alunos.
            </p>
            <p>
                Em resumo, o Encontre Sua Matéria é um site de aulas de reforço completo e eficiente, que 
                oferece aos alunos os recursos necessários para melhorar seu desempenho acadêmico e alcançar 
                seus objetivos educacionais.
            </p>
        </div>
        <div id="main-alunos">
            <img src="img/Alunos.jpg" style="float">
        </div>
    </div>
</template>

<script>
export default {
    name: "QuemSomos"
}
</script>
<style scoped>
  #main-container {
    display: flex;
    flex-wrap: wrap;
  }

  #main-quemsomos {
    width: 50%;
    padding: 0 10px;
  }

  #main-alunos {
    width: 50%;
    display: flex;
    justify-content: flex-end;
  }

  #main-quemsomos h1 {
    font-size: 2em;
    margin-bottom: 1em;
    text-align: justify;
  }

  #main-quemsomos p {
    line-height: 1.5em;
    text-align: justify;
    margin-bottom: 1em;
  }

  #main-alunos img {
    width: 100%;
    max-width: 600px;
    border-radius: 10px;
  }
</style>
