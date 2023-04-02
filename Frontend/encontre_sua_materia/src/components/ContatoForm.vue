Centralize os formularios

<template>
    <div id="main-form">
        <h1>CONTATO</h1>
        <P>Envie a sua dúvida que assim que possível o suporte encontrará em contato com você.</P>
        <form>
            <label for="nome">Nome</label>
            <input type="text" id="nome" name="nome" required>

            <label for="email">E-mail</label>
            <input type="email" id="email" name="email" required>

            <label for="assunto">Assunto</label>
            <input type="text" id="assunto" name="assunto" required>

            <label for="mensagem">Mensagem</label>
            <textarea id="mensagem" name="mensagem" rows="5" required></textarea>

            <button type="submit">Enviar</button>
        </form>
    </div>
</template>

<script>
export default {
    name: "ContatoForm"
}
</script>

<style scoped>

#main-form {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

#main-form h1 {
    font-size: 2em;
    margin-bottom: 1em;
    text-align: center;
}

#main-form p {
    line-height: 1.5em;
    text-align: center;
    margin-bottom: 1em;
}


#main-form form {
    display: flex;
    flex-direction: column;
    align-items: center;
}

#main-form label {
    display: block;
    margin-bottom: 10px;
    font-weight: bold;
}

#main-form input[type="text"],
#main-form input[type="email"],
#main-form textarea {
    width: 100%;
    padding: 10px;
    margin-bottom: 20px;
    border: none;
    border-radius: 5px;
    box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
}

#main-form input[type="text"],
#main-form input[type="email"],
#main-form textarea {
    width: 400px;
    outline: none;
    box-shadow: 0 0 5px rgba(0, 0, 0, 0.5);
}

#main-form button[type="submit"] {
    background-color: #007bff;
    color: #fff;
    font-size: 15px;
    border: none;
    border-radius: 5px;
    padding: 10px 20px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

#main-form button[type="submit"]:hover {
    background-color: #0056b3;
}

</style>