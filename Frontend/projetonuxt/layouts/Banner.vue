<template>
    <div id="main-banner">
        <div id="texto">   
            <h1>Encontre<br>Sua Matéria</h1>
            <p>Quer melhorar seu desempenho acadêmico e alcançar seus objetivos educacionais? 
                Nós temos a solução que você precisa! Com aulas de reforço completas e eficientes, 
                nossos professores capacitados estão prontos para ajudar você a uperar todas as
                suas dificuldades em qualquer disciplina. Oferecemos recursos exclusivos,como materiais
                idáticos atualizados, aulas personalizadas, e acompanhamento constante do seu progresso.
            </p>
            <a href="/CadastroAluno">
            <button>Cadastre-se</button>
            </a>
        </div>
    </div>
</template>

<script>
export default {
    name: "Banner"
}
</script>

<style scoped>
    #main-banner {
        background-image: url('/public/img/fundo.png');
        background-color: #018FA6;
        background-position: 0;
        background-size: cover;
        height: 600px;
        display: flex;
        flex-direction: column;
        align-items: flex-start; 
        justify-content: center; 
        padding-left: 20px;
    }
    
    #texto h1 {
        color: white;
        text-align: left; 
        font-size: 60px;
        margin: 0;
        width: 30%;
        margin-left: 50px;
    }

    #texto p {
        color: white;
        text-align: left; 
        line-height: 1.5em;
        margin-top: 15px; 
        margin-bottom: 0;
        width: 35%;
        margin-left: 50px;
   }

   #texto button {
    background-color: #0056b3;
    font-size: 15px;
    color: #fff;
    border: none;
    border-radius: 5px;
    padding: 20px 30px;
    cursor: pointer;
    transition: background-color 0.3s ease;
    margin-top: 30px;
    margin-left: 50px;
}

#texto button:hover {
    background-color: #007bff;
}
</style>