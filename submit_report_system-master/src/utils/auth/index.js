import Cookie from 'js-cookie'

const USER = 'user'

export const getUser = () => {
  let result = Cookie.get(USER)
  if (result) {
    result = JSON.parse(result)
  }
  return result
}

export const setUser = user => {
  Cookie.set(USER, user)
}

export const deleteUser = () => {
  Cookie.remove(USER)
}
