<template>
  <div class="wrap">
    <div class="form_box">
        <el-form ref="loginForm" :rules="rules" :model="loginForm">
          <h1 class="title">
            Login Form
          </h1>
          <el-form-item prop="username">
            <el-input v-model="loginForm.username" class="form_input" prefix-icon="el-icon-user-solid"></el-input>
          </el-form-item>
          <el-form-item prop="password">
            <el-input type="password" @keyup.enter.native="submit" show-password v-model="loginForm.password" prefix-icon="el-icon-key"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button :loading="loading" type="primary" style="width: 100%;height: 50px;" @click="submit">登录</el-button>
          </el-form-item>
        </el-form>
    </div>
  </div>
</template>

<script>
import { setUser } from '@/utils/auth'
import { reqLogin } from '@/api'
export default {
  data () {
    const passwordValidator = (rule, value, callback) => {
      console.log('passwordValidator', value)
      let result = /^[A-Za-z0-9]+$/g.test(value)
      if (result) {
        callback()
      } else {
        callback(new Error('请输入3~21位的数字和字母组合密码'))
      }
    }
    return {
      loginForm: {
        username: undefined,
        password: undefined
      },
      loading: false,
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          { min: 3, max: 21, message: '请输入3~21位的数字和字母组合密码', trigger: 'change' },
          { validator: passwordValidator, trigger: 'change' }
        ]
      }
    }
  },
  methods: {
    submit () {
      console.log('submit()', this.loginForm.username, this.loginForm.password)
      this.$refs.loginForm.validate(valid => {
        if (valid) {
          this.loading = true
          this.savaUser2Cookie(this.loginForm)
          reqLogin(this.loginForm).then(res => {
            console.log(res)
          })

          setTimeout(() => {
            this.loading = false
            this.$router.replace({ path: '/home' })
          }, 500)
        }
      })
    },
    savaUser2Cookie (user) {
      user = JSON.stringify(user)
      setUser(user)
    }
  }
}
</script>

<style lang="less" scoped>
.wrap {
  background: #2D3A4B;
  height: 100%;
  display: flex;
  .form_box {
    margin: auto;
    margin-top: 200px;
    width: 450px;
    color: #fff;
    .title {
      font-size: 28px;
      font-weight: 800;
      text-align: center;
      padding-bottom: 30px;
    }
    /deep/ .el-input__icon {
      font-size: 19px;
      padding: 0 5px;
    }
    /deep/ .el-input__inner {
      background: #283443;
      color: #fff;
      border: 1px solid #3E4957;
      height: 50px;
      font-size: 19px;
      padding: 0 45px
    }
    /deep/ input__inner:focus {
      border-color: #2D3A4B;
    }
    .form_input {
      background: #2D3A4B;
    }
  }
}
</style>
