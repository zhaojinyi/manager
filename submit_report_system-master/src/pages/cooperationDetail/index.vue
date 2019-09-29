<template>
  <div class="wrap">
    <div class="content">
      <el-form label-width="100px" size="mini">
        <el-form-item label="商家客户：">
          <el-input v-model="form.name" disabled/>
        </el-form-item>
        <el-form-item label="零点提报：">
          <el-radio label="零点" v-model="form.name"/>
          <el-radio label="非零点" v-model="form.name"/>
        </el-form-item>
        <el-form-item label="商品标题：">
          <el-input v-model="form.name"/>
        </el-form-item>
        <el-form-item label="商品ID：">
          <div class="flex">
            <el-input v-model="form.name"/>
            <el-button type="primary">检测</el-button>
          </div>
        </el-form-item>
        <el-form-item label="商品活动：">
          <el-radio label="常规单" v-model="form.name"/>
          <el-radio label="聚划算" v-model="form.name"/>
          <el-radio label="淘抢购" v-model="form.name"/>
        </el-form-item>
        <el-form-item label="商品分类：">
          <el-select :value="form.name">
            <el-option value="form.name" label="111"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="商品主图：">
          <div class="flex">
            <el-input :value="form.name"></el-input>
            <el-button type="primary">查看营销图</el-button>
          </div>
        </el-form-item>
        <el-form-item label="商品营销图：">
          <div class="flex">
            <el-input :value="form.name"></el-input>
            <el-button type="primary">查看营销图</el-button>
          </div>
        </el-form-item>
        <el-form-item label="推广文案：">
          <el-input type="textarea" :value="form.name"></el-input>
        </el-form-item>
        <el-form-item label="特色文案：">
          <el-input type="textarea" :value="form.name"></el-input>
        </el-form-item>
        <el-form-item label="开始时间">
          <el-radio v-model="form.beginTime" label="立即开始"></el-radio>
          <el-radio v-model="form.beginTime" label="预告"></el-radio>
        </el-form-item>
        <el-form-item label="预告时间" v-if="form.beginTime === '预告'">
          <el-date-picker
            v-model="form.name"
            type="date"
            placeholder="选择日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="优惠券类型：">
          <el-radio label="普通券、新版妈妈券" v-model="form.name"/>
          <el-radio label="妈妈券（无链接）" v-model="form.name"/>
        </el-form-item>
        <el-form-item label="优惠券名称：">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="优惠券链接：">
          <div class="flex">
            <el-input v-model="form.name"></el-input>
            <el-button type="primary">查看优惠券</el-button>
          </div>
        </el-form-item>
        <el-form-item label="优惠券总量：" required>
          <el-input type="number" v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="券后价：">
          <el-input type="number" v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="服务费单价：">
          <el-input type="number" v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="结束时间：">
          <el-date-picker
            v-model="form.name"
            type="date"
            placeholder="请选择日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="预汇款时间：">
          <el-date-picker
            v-model="form.name"
            type="date"
            placeholder="请选择日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="备注">
          <el-input type="textarea" v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="券面额：">
          <el-input type="number" v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="淘宝价：">
          <el-input type="number" v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="拍几件：">
          <el-input type="number" v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="线上线下结算：">
          <el-radio label="线上结算" v-model="form.name"/>
          <el-radio label="线下结算" v-model="form.name"/>
        </el-form-item>
        <el-form-item label="上传实拍图：">
          <div class="flex">
            <el-input v-model="form.name"></el-input>
            <el-input v-model="form.name"></el-input>
            <el-input v-model="form.name"></el-input>
            <el-input v-model="form.name"></el-input>
          </div>
        </el-form-item>
        <el-form-item label="选择平台：">
          <el-radio label="大淘客" v-model="form.name"/>
          <el-radio label="选单网" v-model="form.name"/>
        </el-form-item>
        <el-form-item>
          <el-button type="primary">提交</el-button>
          <el-button @click="back">返回</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      form: {}
    }
  },
  methods: {
    back () {
      this.$router.go(-1)
    }
  }
}
</script>

<style scoped lang='less'>
.flex {
  display: flex;
  justify-content: center;
  align-items: center;
}
.content {
  width: 60%;
  margin: 0 auto;
}
</style>
