<template>
  <div class="wrap">
    <div class="title">新增客户信息</div>
    <div class="content">
      <el-form :model="form" label-width="120px" label-position="left" size="mini">
        <el-form-item label="店铺名称：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="旺旺账号：">
          <div class="oneline">
            <el-input v-model="form.name"></el-input>
            <el-button type="primary">检测</el-button>
          </div>
        </el-form-item>
        <el-form-item label="店铺老板：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="店铺QQ：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="店铺链接：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="成熟度：">
          <el-select v-model="form.name" style="width: 100%">
            <el-option v-for="(maturity, index) in maturities" :key="index" :value="maturity.value">{{ maturity.label }}</el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="店铺类型：">
          <el-select v-model="form.name" style="width: 100%">
            <el-option v-for="(item, index) in status" :key="index" :value="item.value">{{ item.label }}</el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="主营：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="运营名称：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="运营QQ：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="运营微信：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="运营电话：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="店铺电话：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">立即创建</el-button>
          <el-button @click="back">取消</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      form: {},
      maturities: [
        { label: 'A(已合作大客户)', value: '0' }
      ],
      status: [
        { label: '淘宝', value: '0' },
        { label: '天猫', value: '1' }
      ]
    }
  },
  methods: {
    onSubmit () {

    },
    back () {
      this.$router.go(-1)
    }
  }
}
</script>

<style scoped lang='less'>
.wrap{
  padding: 30px;
  .title{
    color: #000;
    margin-bottom: 20px;
    font-family: 700;
  }
  .content{
    width: 60%;
    .oneline{
      width: 100%;
      display: flex;
      justify-content: space-between;
      align-items: center;
    }
  }
}
</style>
