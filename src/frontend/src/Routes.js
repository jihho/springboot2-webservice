import Vue from 'vue'
import Router from 'vue-router'
import Login from './pages/Login/Login.vue'
import WriteBoard from './pages/Board/Write.vue'

Vue.use(Router)

export default new Router({
    mode: "history",
    routes: [
        {
            path: '/login',
            name: 'login',
            component: Login
        },
        {
            path: '/board/write',
            name: 'WriteBoard',
            component: WriteBoard
        }
    ]
})