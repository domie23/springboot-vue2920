const base = {
    get() {
        return {
            url : "http://localhost:8080/zichanguanlixinxixitong/",
            name: "zichanguanlixinxixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zichanguanlixinxixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "资产管理信息系统"
        } 
    }
}
export default base
