<template>
  <el-menu
    default-active="home"
    class="el-menu-demo"
    mode="horizontal"
    background-color="#5197D7"
    text-color="#fff"
    router
    active-text-color="#ffd04b"
  >
    <el-menu-item index="/home">系统首页</el-menu-item>
    <el-submenu index="2">
      <template slot="title">客户管理</template>
      <el-menu-item index="/customer">私海客户</el-menu-item>
      <el-menu-item index="2-2">部门公海</el-menu-item>
      <el-menu-item index="2-3">公海客户</el-menu-item>
      <el-menu-item index="2-4">合作明细</el-menu-item>
      <el-menu-item index="2-5">重复数据</el-menu-item>
      <el-menu-item index="2-6">后台明细</el-menu-item>
      <el-menu-item index="2-7">维权状态</el-menu-item>
      <el-menu-item index="2-8">查款管理</el-menu-item>
      <el-menu-item index="2-9">返/退款</el-menu-item>
      <el-menu-item index="2-10">合同单明细</el-menu-item>
      <el-menu-item index="2-11">合同返款</el-menu-item>
      <el-menu-item index="2-12">收益分成</el-menu-item>
    </el-submenu>
    <el-menu-item index="3">系统管理</el-menu-item>
  </el-menu>
</template>

<script>
export default {

}
</script>

<style>
</style>
