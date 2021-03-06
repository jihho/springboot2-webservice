import Vue from 'vue'
import Router from 'vue-router'
import Login from './pages/Login/Login.vue'
import WriteBoard from './pages/Board/Write.vue'
import ListBoard from './pages/Board/List.vue'
import ViewBoard from './pages/Board/View.vue'

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
        },
        {
            path: '/board/list',
            name: 'ListBoard',
            component: ListBoard
        },
        {
            path: '/board/view',
            name: 'ViewBoard',
            component: ViewBoard
        }
    ]
})