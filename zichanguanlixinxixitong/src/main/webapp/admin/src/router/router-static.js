import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gudingzichan from '@/views/modules/gudingzichan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zichanjiechu from '@/views/modules/zichanjiechu/list'
    import zichanweixiu from '@/views/modules/zichanweixiu/list'
    import dictionaryAdd from '@/views/modules/dictionaryAdd/list'
    import dictionaryAddress from '@/views/modules/dictionaryAddress/list'
    import dictionaryBumen from '@/views/modules/dictionaryBumen/list'
    import dictionaryGudingzichan from '@/views/modules/dictionaryGudingzichan/list'
    import dictionaryGudingzichanStatus from '@/views/modules/dictionaryGudingzichanStatus/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryZichanweixiuStatus from '@/views/modules/dictionaryZichanweixiuStatus/list'
    import zichanzhejiu from '@/views/modules/zichanzhejiu/list'






//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryAdd',
        name: '增加方式',
        component: dictionaryAdd
    }
    ,{
        path: '/dictionaryAddress',
        name: '存放地点',
        component: dictionaryAddress
    }
    ,{
        path: '/dictionaryBumen',
        name: '使用部门',
        component: dictionaryBumen
    }
    ,{
        path: '/dictionaryGudingzichan',
        name: '资产类型',
        component: dictionaryGudingzichan
    },
	,{
	    path: '/zichanzhejiu',
	    name: '资产折旧',
	    component: zichanzhejiu
	}
	
    ,{
        path: '/dictionaryGudingzichanStatus',
        name: '资产状态',
        component: dictionaryGudingzichanStatus
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryZichanweixiuStatus',
        name: '维修状态',
        component: dictionaryZichanweixiuStatus
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/gudingzichan',
        name: '固定资产',
        component: gudingzichan
      }
    ,{
        path: '/yonghu',
        name: '保管人员',
        component: yonghu
      }
    ,{
        path: '/zichanjiechu',
        name: '资产借出',
        component: zichanjiechu
      }
    ,{
        path: '/zichanweixiu',
        name: '资产维修',
        component: zichanweixiu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
