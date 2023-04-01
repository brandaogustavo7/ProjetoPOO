<template>
    <div id="nav">
        <router-link to="/" id="logo-url">
            <img :src="logo" :alt="alt" id="logo">
        </router-link>

        <div id="search-container">
            <input type="text" placeholder="Pesquisar...">
            <button type="submit"><i class="fa fa-search"></i></button>
        </div>

        <router-link to="/">Home</router-link> 
        <router-link to="/login">Login</router-link> 
        <!--<router-link to="/perfil">Perfil</router-link>-->
    </div>
</template>
<script>
    export default {
        name: "Navbar",
        props: ["logo", "alt"]
    }

</script>
<style>
    #nav {
        height: 80px;
        background-color: #018FA6;
        border-bottom: 4px solid white;
        padding: 15px 50px;
        display: flex;
        justify-content:  flex-end;
        align-items: center;
    }

    #nav #logo-url {
        margin: auto;
        margin-left: 0;
        padding-top: 0;
    }

    #logo {
        width: 150px;
    }

    #nav a{
        color: white;
        text-decoration: none;
        margin: 12px;
        transition: .5s;
    }

    #nav a:hover {
        color: black;
    }

    /*barra de pequeisa*/
    #search-container {
        display: flex;
        align-items: center;
        background-color: #f2f2f2;
        border-radius: 20px;
        padding: 5px 10px;
    }

    #search-container input[type="text"] {
        flex: 1;
        border: none;
        font-size: 16px;
    }

    #search-container button[type="submit"] {
        background-color: #1e88e5;
        color: white;
        border: none;
        padding: 10px;
        font-size: 16px;
        border-radius: 50%;
        margin-left: 5px;
    }

    #search-container button[type="submit"]:hover {
        cursor: pointer;
    }

</style>