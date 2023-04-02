<template>
    <div id="main-login">
    <h1>Login</h1>
    <form>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        
        <label for="password">Senha:</label>
        <input type="password" id="password" name="password" required>
        
        <button type="submit">Entrar</button>
    </form>
    
    <p>Não possui uma conta? <a href="#">Cadastre-se</a></p>
    </div>
</template>
<script>
export default {
    name: "LoginForm"
}

</script>
<style>
#main-login {
    max-width: 400px;
    margin: 0 auto;
    text-align: center;
    border: 1px solid #ddd;
    border-radius: 5px;
    padding: 20px;
}

#main-login h1 {
    margin-top: 0;
    font-size: 2em;
    margin-bottom: 1em;
}

#main-login form {
    display: flex;
    flex-direction: column;
}

#main-login label {
    display: block;
    margin-bottom: 10px;
    font-weight: bold;
}

#main-login input[type="email"],
#main-login input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 20px;
    border: none;
    border-radius: 5px;
    box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
}

#main-login input[type="email"]:focus,
#main-login input[type="password"]:focus {
    outline: none;
    box-shadow: 0 0 5px rgba(0, 0, 0, 0.5);
}

#main-login button[type="submit"] {
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 5px;
    padding: 10px 20px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

#main-login button[type="submit"]:hover {
    background-color: #0056b3;
}

#main-login p {
    margin-top: 20px;
}
</style>