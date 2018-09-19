import Vue from 'vue'
import Router from 'vue-router'
import Lista from '@/components/Lista'
Vue.use(Router)
// eslint-disable-next-line
/* eslint-disable */
export default new Router({
  routes: [
    {
      path:'/listarLivros',
      name:'Lista', 
      component:Lista,
    }
  ]
})
