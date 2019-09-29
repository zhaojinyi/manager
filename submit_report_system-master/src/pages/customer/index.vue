<template>
  <div>
    <el-row class="form_row">
      <el-form inline size="mini">
          <el-form-item label="下次跟进时间:" label-width="100px">
            <el-date-picker
              v-model="form.name"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
          </el-form-item>
          <el-form-item label="回款时间:" label-width="80px">
            <el-date-picker
              v-model="form.name"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
          </el-form-item>
          <el-form-item label="创建时间:" label-width="80px">
            <el-date-picker
              v-model="form.name"
              type="date"
              placeholder="选择日期">
            </el-date-picker>
          </el-form-item>
          <el-form-item label="成熟度:" label-width="60px">
            <el-select value="0">
              <el-option value="0" label="123"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="主营:" label-width="50px">
            <el-input :value="form.name"></el-input>
          </el-form-item>
          <el-form-item label="店铺信息查询:" label-width="100px">
            <div class="flex">
              <el-select value="0">
                <el-option value="0" label="店铺名称"></el-option>
                <el-option value="1" label="旺旺号"></el-option>
              </el-select>
              <el-input :value="form.name"></el-input>
            </div>
          </el-form-item>
          <br>
          <el-form-item label="合作产品ID:" label-width="100px">
            <el-input :value="form.name"></el-input>
          </el-form-item>
          <el-form-item label="回款金额区间查询:" label-width="130px">
            <div class="flex">
              <el-input :value="form.name"></el-input>
              <span>到</span>
              <el-input :value="form.name"></el-input>
            </div>
          </el-form-item>
          <el-form-item label="销售部:" label-width="60px">
            <div>
              <el-select value="0">
                <el-option value="0" label="123"></el-option>
              </el-select>
            </div>
          </el-form-item>
          <el-form-item label="组别:" label-width="60px">
            <div>
              <el-select value="0">
                <el-option value="0" label="123"></el-option>
              </el-select>
            </div>
          </el-form-item>
          <el-form-item label="部门人员:" label-width="80px">
            <div>
              <el-select value="0">
                <el-option value="0" label="123"></el-option>
              </el-select>
            </div>
          </el-form-item>
          <br>
          <el-form-item label="资料类型:" label-width="80px">
            <div>
              <el-select value="0">
                <el-option value="0" label="123"></el-option>
              </el-select>
            </div>
          </el-form-item>
           <el-form-item label="资料数量:" label-width="80px">
            <div>
              <el-select value="0">
                <el-option value="0" label="123"></el-option>
              </el-select>
            </div>
          </el-form-item>
      </el-form>
      <el-row>
        <el-button type="primary" size="mini">查询</el-button>
        <el-button type="default" size="mini">重置</el-button>
        <el-button type="success" size="mini" @click="addCustomer">新建</el-button>
        <el-button type="warning" size="mini">导入</el-button>
        <el-button type="primary" size="mini">模板下载</el-button>
      </el-row>
    </el-row>
    <el-row>
      <el-table
        ref="table"
        size="mini"
        :header-cell-style="{ textAlign: 'center', background: '#eee' }"
        :cell-style="{ textAlign: 'center' }"
        :data="tableData"
        tooltip-effect="dark"
        style="width: 100%;"
        @selection-change="handleSelectionChange"
      >
        <el-table-column type="selection"/>
        <el-table-column type="index" label="序号"/>
        <el-table-column prop="name" label="所属小组"/>
        <el-table-column prop="name" label="所属人员"/>
        <el-table-column prop="name" label="所属部门"/>
        <el-table-column prop="name" label="店铺名称"/>
        <el-table-column prop="name" label="旺旺账号"/>
        <el-table-column prop="name" label="成熟度"/>
        <el-table-column prop="name" label="运营QQ"/>
        <el-table-column prop="name" label="下次跟进时间"/>
        <el-table-column prop="name" label="跟进记录"/>
        <el-table-column prop="name" label="回款时间"/>
        <el-table-column prop="name" label="回款金额"/>
        <el-table-column prop="name" label="店铺类型"/>
        <el-table-column prop="name" label="运营名称"/>
        <el-table-column prop="name" label="运营电话"/>
        <el-table-column prop="name" label="资料类型"/>
        <el-table-column prop="name" label="操作人"/>
        <el-table-column prop="name" label="打标类型"/>
        <el-table-column label="操作" width="150">
          <template slot-scope="scope">
            <el-button type="primary" size="mini" @click="submitReport(scope.row)">提报</el-button>
            <el-button type="danger" size="mini">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        background
        class="pagination"
        layout="prev, pager, next"
        :total="1000">
      </el-pagination>
    </el-row>
  </div>
</template>

<script>
export default {
  data () {
    return {
      form: {},
      tableData: [
        { name: '112312312131234561231643132' }
      ]
    }
  },
  methods: {
    submitReport (item) {
      this.$router.push({ path: '/cooperationDetail' })
    },
    handleSelectionChange () {

    },
    addCustomer () {
      this.$router.push({ path: '/customer/add' })
    }
  }
}
</script>

<style scoped>
.pagination {
  margin-top: 20px;
  float: right;
}
.form_row {
  margin-bottom: 20px;
}
.flex {
  display: flex;
  justify-content: center;
}
.flex span {
  padding: 0 20px;
}
.el-date-editor.el-input {
  width: 130px;
}
.el-select {
  width: 130px;
}
</style>
