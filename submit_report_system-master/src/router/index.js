import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: () => import('@/pages/login')
    },
    {
      path: '/',
      name: 'home',
      component: () => import('@/MainLayout'),
      children: [
        {
          path: '/home',
          name: 'home',
          component: () => import('@/pages/home')
        },
        {
          // 私海客户
          path: '/customer',
          name: 'customer',
          component: () => import('@/Layout'),
          redirect: 'customer/index',
          children: [
            {
              path: 'index',
              name: 'customerIndex',
              component: () => import('@/pages/customer')
            },
            {
              path: 'add',
              name: 'customerAdd',
              component: () => import('@/pages/customer/add')
            }
          ]
        },
        {
          path: '/cooperationDetail',
          name: 'cooperationDetail',
          component: () => import('@/pages/cooperationDetail')
        }
      ]
    },
    {
      path: '/404',
      name: '404',
      component: () => import('@/pages/404')
    },
    { path: '*', redirect: '/404', hidden: true }
  ]
})
