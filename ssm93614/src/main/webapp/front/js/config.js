
var projectName = '在线房屋租赁系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '房源信息',
	url: './pages/fangyuanxinxi/list.html'
}, 
{
	name: '成交价走势',
	url: './pages/chengjiaojiazoushi/list.html'
}, 

{
	name: '公告',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm93614/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"租户","menuJump":"列表","tableName":"zuhu"}],"menu":"租户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"经纪人","menuJump":"列表","tableName":"jingjiren"}],"menu":"经纪人管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","查看评论","报表"],"menu":"房源信息","menuJump":"列表","tableName":"fangyuanxinxi"}],"menu":"房源信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房源类型","menuJump":"列表","tableName":"fangyuanleixing"}],"menu":"房源类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房子户型","menuJump":"列表","tableName":"fangzihuxing"}],"menu":"房子户型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"合同文件","menuJump":"列表","tableName":"hetongwenjian"}],"menu":"合同文件管理"},{"child":[{"buttons":["新增","查看","修改","删除","取消订单","退租","签订合同"],"menu":"交易订单","menuJump":"列表","tableName":"jiaoyidingdan"}],"menu":"交易订单管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"退租单","menuJump":"列表","tableName":"tuizudan"}],"menu":"退租单管理"},{"child":[{"buttons":["新增","查看","修改","删除","导出"],"menu":"业务情况","menuJump":"列表","tableName":"yewuqingkuang"}],"menu":"业务情况管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","支付"],"menu":"取消订单","menuJump":"列表","tableName":"quxiaodingdan"}],"menu":"取消订单管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"成交价走势","menuJump":"列表","tableName":"chengjiaojiazoushi"}],"menu":"成交价走势管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"公告","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"客服中心","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","租房","报表"],"menu":"房源信息列表","menuJump":"列表","tableName":"fangyuanxinxi"}],"menu":"房源信息模块"},{"child":[{"buttons":["报表","查看"],"menu":"成交价走势列表","menuJump":"列表","tableName":"chengjiaojiazoushi"}],"menu":"成交价走势模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["报表","查看"],"menu":"房源信息","menuJump":"列表","tableName":"fangyuanxinxi"}],"menu":"房源信息管理"},{"child":[{"buttons":["查看"],"menu":"合同文件","menuJump":"列表","tableName":"hetongwenjian"}],"menu":"合同文件管理"},{"child":[{"buttons":["查看","支付","签订合同","退租","取消订单"],"menu":"交易订单","menuJump":"列表","tableName":"jiaoyidingdan"}],"menu":"交易订单管理"},{"child":[{"buttons":["查看"],"menu":"退租单","menuJump":"列表","tableName":"tuizudan"}],"menu":"退租单管理"},{"child":[{"buttons":["查看"],"menu":"取消订单","menuJump":"列表","tableName":"quxiaodingdan"}],"menu":"取消订单管理"},{"child":[{"buttons":["查看","报表"],"menu":"成交价走势","menuJump":"列表","tableName":"chengjiaojiazoushi"}],"menu":"成交价走势管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","租房","报表"],"menu":"房源信息列表","menuJump":"列表","tableName":"fangyuanxinxi"}],"menu":"房源信息模块"},{"child":[{"buttons":["报表","查看"],"menu":"成交价走势列表","menuJump":"列表","tableName":"chengjiaojiazoushi"}],"menu":"成交价走势模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"租户","tableName":"zuhu"},{"backMenu":[{"child":[{"buttons":["新增","修改","删除","查看","报表"],"menu":"房源信息","menuJump":"列表","tableName":"fangyuanxinxi"}],"menu":"房源信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房源类型","menuJump":"列表","tableName":"fangyuanleixing"}],"menu":"房源类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房子户型","menuJump":"列表","tableName":"fangzihuxing"}],"menu":"房子户型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"合同文件","menuJump":"列表","tableName":"hetongwenjian"}],"menu":"合同文件管理"},{"child":[{"buttons":["查看","取消订单"],"menu":"交易订单","menuJump":"列表","tableName":"jiaoyidingdan"}],"menu":"交易订单管理"},{"child":[{"buttons":["查看"],"menu":"退租单","menuJump":"列表","tableName":"tuizudan"}],"menu":"退租单管理"},{"child":[{"buttons":["查看"],"menu":"业务情况","menuJump":"列表","tableName":"yewuqingkuang"}],"menu":"业务情况管理"},{"child":[{"buttons":["查看"],"menu":"取消订单","menuJump":"列表","tableName":"quxiaodingdan"}],"menu":"取消订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","租房","报表"],"menu":"房源信息列表","menuJump":"列表","tableName":"fangyuanxinxi"}],"menu":"房源信息模块"},{"child":[{"buttons":["报表","查看"],"menu":"成交价走势列表","menuJump":"列表","tableName":"chengjiaojiazoushi"}],"menu":"成交价走势模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"经纪人","tableName":"jingjiren"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
