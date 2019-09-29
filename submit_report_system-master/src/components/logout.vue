<template>
  <div class="wrap">
    <i class="el-icon-user-solid"></i>
    <div>欢迎</div>
    <div style="padding: 0 10px;">吴小婧</div>
    <div style="margin-right: 10px;">使用网上办公平台</div>
    <div style="cursor: pointer;" @click="logout">退出系统</div>
  </div>
</template>

<script>
import { deleteUser } from '@/utils/auth'
export default {
  methods: {
    logout () {
      this.$confirm('确认退出吗？', {})
        .then(() => {
          deleteUser()
          setTimeout(() => {
            this.$router.replace({ path: '/login' })
          }, 300)
        })
    }
  }
}
</script>

<style scoped>
.wrap {
  background: #5197D7;
  height: 100%;
  width: 400px;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 14px;
  color: #fff;
}

</style>
