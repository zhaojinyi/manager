import router from './router'
import { getUser } from '@/utils/auth'

router.beforeEach((to, from, next) => {
  const result = isLogin()
  if (result && to.path !== '/login') {
    if (to.path === '/') {
      next({ path: '/home' })
    } else {
      next()
    }
  } else if (to.path === '/login') {
    if (result) {
      next({ path: '/home' })
    } else {
      next()
    }
  } else {
    next({ path: '/login' })
  }

  function isLogin () {
    return getUser()
  }
})
