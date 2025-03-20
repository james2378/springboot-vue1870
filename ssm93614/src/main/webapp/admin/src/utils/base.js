const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm93614/",
            name: "ssm93614",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm93614/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线房屋租赁系统"
        } 
    }
}
export default base
