import ajax from './axios'

const PRE_URL = '/api'

export const reqLogin = (user) => ajax(PRE_URL + '/login', user, 'post')
