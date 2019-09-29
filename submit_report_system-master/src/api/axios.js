import axios from 'axios'

export default function ajax (url, data = {}, type = 'GET') {
  return new Promise((resolve, reject) => {
    let promise
    if (type === 'GET' || type === 'get') {
      promise = axios.get(url, {
        params: data
      })
    } else {
      promise = axios.post(url, data)
    }

    promise.then(response => {
      resolve(response)
    }).catch(() => {
      this.$message.error('请求失败了')
    })
  })
}
