package com.ribuluo.admin.controller;

import com.ribuluo.admin.common.annotation.NoVerify;
import com.ribuluo.common.util.R;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.util.Map;

/**
 * @Api：用在请求的类上，说明该类的作用
    tags="说明该类的作用"
    value="该参数没什么意义，所以不需要配置",
    description="具体描述"
 * */
@Api(tags = "swagger示例",description = "swagger注释示例和接口返回值示例")
@RestController
@RequestMapping("demo")
public class DemoController {

	/**
	  * @ApiOperation："用在请求的方法上，说明方法的作用"value="说明方法的作用" notes="方法的备注说明"
	    @ApiImplicitParams：用在请求的方法上，包含一组参数说明
	    @ApiImplicitParam：用在 @ApiImplicitParams 注解中，指定一个请求参数的配置信息
        name：参数名
        value：参数的汉字说明、解释
        required：参数是否必须传
        paramType：参数放在哪个地方
            · header --> 请求参数的获取：@RequestHeader
            · query --> 请求参数的获取：@RequestParam
            · path（用于restful接口）--> 请求参数的获取：@PathVariable
            · body（不常用）
            · form（不常用）
        dataType：参数类型，默认String，其它值dataType="Integer"
        defaultValue：参数的默认值
	 * @Author saury
	 * @date 2019年12月31日 
	 * @param wid
	 * @return
	 */
    @NoVerify
    @ApiOperation(value = "详情接口", notes = "2.0 saury",code = 200,produces = "application/json",response=R.class)
    @ApiImplicitParam(name = "wid", value = "wid示例：1234567", required = true, paramType = "path")
    @GetMapping("example/{wid}")
    public R<String> exampleDetail(@PathVariable String wid){
        try{
            return new R<>(wid);
        }catch(Exception e){
            return R.error("接口报错",R.FAIL);
        }
    }
    @ApiOperation(value = "分页接口", notes = "2.0 saury", response = R.class)
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(name = "pageNum", value = "分页参数：第几页", required = true, paramType = "query", dataType = "int"),
                    @ApiImplicitParam(name = "pageSize", value = "分页参数：每页数量", required = true, paramType = "query", dataType = "int")
            }
    )

    @NoVerify
    @GetMapping("example")
    public R<Map<String,Object>> examplePage(@ApiIgnore @RequestParam Map<String,Object> params){
        try{
            return R.success(params);
        }catch(Exception e){
            return R.error("接口报错",R.FAIL);
        }
    }
    @ApiOperation(value = "post请求", notes = "2.0 saury",code = 200, produces = "application/json",response=R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "params", value = "json参数示例:{\"tableName\":\"TB_DIC_TEST\",\"orderBy\":\"\"}", required = true, dataType = "json", paramType = "body")
    })
    @PostMapping("example")
    public R<Map<String,Object>> saveExample(@RequestBody Map<String,Object> params) {
        try{
            return R.success(params);
        }catch(Exception e){
            return R.error("接口报错",R.FAIL);
        }
    }

    @NoVerify
    @ApiOperation(value = "put请求", notes = "2.0 saury", response = R.class)
    @ApiImplicitParam(name = "demo", value = "参数", required = true, paramType = "body", dataType = "Demo")
    @PutMapping("/example")
    public R<Demo> updatEexample(@Valid @RequestBody Demo demo) {
        try{
            return R.success(demo);
        }catch(Exception e){
            return R.error("接口报错",R.FAIL);
        }
    }
    /**
     * @ApiModel：用于响应类上，表示一个返回响应数据的信息
	            （这种一般用在post创建的时候，使用@RequestBody这样的场景，
	            请求参数无法使用@ApiImplicitParam注解进行描述的时候）
	    @ApiModelProperty：用在属性上，描述响应类的属性
    * Description:
    * @author saury  
    * @date 2019年12月31日
     */
    @ApiModel(description= "返回响应数据")
    class Demo{
        @ApiModelProperty(value = "是否成功")
        String flag;
        @ApiModelProperty(value = "状态码")
        String code;

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
