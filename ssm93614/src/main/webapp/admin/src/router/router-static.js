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
    import news from '@/views/modules/news/list'
    import fangyuanxinxi from '@/views/modules/fangyuanxinxi/list'
    import yewuqingkuang from '@/views/modules/yewuqingkuang/list'
    import storeup from '@/views/modules/storeup/list'
    import jingjiren from '@/views/modules/jingjiren/list'
    import zuhu from '@/views/modules/zuhu/list'
    import hetongwenjian from '@/views/modules/hetongwenjian/list'
    import tuizudan from '@/views/modules/tuizudan/list'
    import fangyuanleixing from '@/views/modules/fangyuanleixing/list'
    import discussfangyuanxinxi from '@/views/modules/discussfangyuanxinxi/list'
    import quxiaodingdan from '@/views/modules/quxiaodingdan/list'
    import chat from '@/views/modules/chat/list'
    import messages from '@/views/modules/messages/list'
    import chengjiaojiazoushi from '@/views/modules/chengjiaojiazoushi/list'
    import jiaoyidingdan from '@/views/modules/jiaoyidingdan/list'
    import config from '@/views/modules/config/list'
    import fangzihuxing from '@/views/modules/fangzihuxing/list'


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
    }
      ,{
	path: '/news',
        name: '公告',
        component: news
      }
      ,{
	path: '/fangyuanxinxi',
        name: '房源信息',
        component: fangyuanxinxi
      }
      ,{
	path: '/yewuqingkuang',
        name: '业务情况',
        component: yewuqingkuang
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/jingjiren',
        name: '经纪人',
        component: jingjiren
      }
      ,{
	path: '/zuhu',
        name: '租户',
        component: zuhu
      }
      ,{
	path: '/hetongwenjian',
        name: '合同文件',
        component: hetongwenjian
      }
      ,{
	path: '/tuizudan',
        name: '退租单',
        component: tuizudan
      }
      ,{
	path: '/fangyuanleixing',
        name: '房源类型',
        component: fangyuanleixing
      }
      ,{
	path: '/discussfangyuanxinxi',
        name: '房源信息评论',
        component: discussfangyuanxinxi
      }
      ,{
	path: '/quxiaodingdan',
        name: '取消订单',
        component: quxiaodingdan
      }
      ,{
	path: '/chat',
        name: '客服中心',
        component: chat
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/chengjiaojiazoushi',
        name: '成交价走势',
        component: chengjiaojiazoushi
      }
      ,{
	path: '/jiaoyidingdan',
        name: '交易订单',
        component: jiaoyidingdan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/fangzihuxing',
        name: '房子户型',
        component: fangzihuxing
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
