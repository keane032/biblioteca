<template>
    <div id="lista">
        <h3>Lista de Livros</h3>
        <ul>
            <li v-for=" livro of Livros" :key="livro.id">
               id: {{livro.id}},
                nome: {{livro.nome}},
                autor :{{livro.autor}},
                descriçao:{{livro.descricao}}
                <button type="button" v-on:click.prevent="remover(livro)"> remover </button>
                 <button type="button" v-on:click.prevent="show(livro)"> Atualizar </button>
            </li>
        </ul>
            <!-- <modal name="hello-world">
            <label for="nome">nome</label>
            <input type="text" name="nome" id="nome" v-model="uplivro.nome">
            <br>
            <label for="autor">autor</label>
            <input type="text" name="autor" id="autor" v-model="uplivro.autor">
            <br>
            <label for="descricao">descriçao</label>
            <input type="text" name="descricao" id="descricao" v-model="uplivro.descricao">
            <br>
            <button v-on:click.prevent="put">salvar</button>
            <button v-on:click.prevent="hide()">cancelar</button>
            </modal> -->
    </div>
</template>

<script>
// eslint-disable-next-line
/* eslint-disable */
import Router from 'vue-router'
let varurl = 'http://localhost:8080/app';
export default {
    name: 'Lista',
    data (){
        return{
            livro:{
                 id:"",
                 nome:"",
                 autor:"",
                 descricao:""
            },
            Livros:[],
            uplivro:{
                 id:"",
                 nome:"",
                 autor:"",
                 descricao:""
            },

        }
       
    },
    mounted(){
        this.get()  
    },
    methods: {
        remover:function(livro){
            this.$http.delete(varurl+'/livro',
            {body:{
               id:livro.id,
               nome:livro.nome,
               autor:livro.autor,
               descricao:livro.descricao
            }},{
            headers: {
                'Content-Type': 'application/json'  
            }
            }
            ).then(function(){
                this.get()
            }); 
        },
        get:function(){
            this.$http.get(varurl+'/listar').then(response => {
                this.Livros = response.data
            }, response => {
                
            });
        },
        put:function(){
            this.$http.put(varurl+'/livro',
           {
               id:this.uplivro.id,
               nome:this.uplivro.nome,
               autor: this.uplivro.autor,
               descricao: this.uplivro.descricao
           },{
            headers: {
            'Content-Type': 'application/json'
            }
            }
            ).then(function(data){
                //console.log("funcionou");
                this.$router.push('/listar')
                this.hide()
                
        });
    },
       
    }   

}
</script>
