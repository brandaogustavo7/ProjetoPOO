<template>
    <div id="main-cadastro">
    <h1>Cadastro</h1>
    <form>
        <label for="username">Nome de usuário:</label>
        <input type="text" id="username" name="username" v-model="username" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" v-model="email" required>

        <label for="password">Senha:</label>
        <input type="password" id="password" name="password" v-model="password" required>
        
        <label for="name">Nome completo:</label>
        <input type="text" id="name" name="name" v-model="name" required>
        
        <label for="name">CPF:</label>
        <input type="text" id="cpf" name="cpf" v-model="name" required>
        
        <label for="birthdate">Data de nascimento:</label>
        <input type="date" id="birthdate" name="birthdate" v-model="birthdate" required>

        <label for="phone">Telefone:</label>
        <input type="text" id="phone" name="phone" v-model="phone" required>
        
       
        
        
        
        <button type="submit">Cadastrar</button>
    </form>
    </div>
</template>

<script>
export default {
    name: "CadastroAlunoForm"
}
</script>

<style scoped>
#main-cadastro {
    max-width: 400px;
    margin: 0 auto;
    text-align: center;
    border: 1px solid #ddd;
    border-radius: 5px;
    padding: 20px;
    margin-top: 50px;
    margin-bottom: 50px;
}

#main-cadastro h1 {
    margin-top: 0;
    font-size: 2em;
    margin-bottom: 1em;
}

#main-cadastro form {
    display: flex;
    flex-direction: column;
}

#main-cadastro label {
    display: block;
    margin-bottom: 10px;
    font-weight: bold;
}

#main-cadastro input[type="email"],
#main-cadastro input[type="text"],
#main-cadastro input[type="date"],
#main-cadastro input[type="password"],
#main-cadastro select {
    width: 100%;
    padding: 10px;
    margin-bottom: 20px;
    border: none;
    border-radius: 5px;
    box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
    background-color: #ffffff;
}

#main-cadastro input[type="email"]:focus,
#main-cadastro input[type="text"]:focus,
#main-cadastro input[type="date"]:focus,
#main-cadastro input[type="password"]:focus,
#main-cadastro select:focus {
    outline: none;
    box-shadow: 0 0 5px rgba(0, 0, 0, 0.5);
    background-color: #007bff;
}

#main-cadastro button[type="submit"] {
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 5px;
    padding: 10px 20px;
    cursor: pointer;
    transition: background-color 0.3s ease;
    font-size: 15px;
}

#main-cadastro button[type="submit"]:hover {
    background-color: #0056b3;
}
</style>