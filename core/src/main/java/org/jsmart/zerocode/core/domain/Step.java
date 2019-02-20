package org.jsmart.zerocode.core.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
/**
 * Do not enable this @JsonIgnoreProperties(ignoreUnknown = true) as this will suppress the test data failure,
 * let it spit out the exception(s) in case of a bad json/test input
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
/*
* @Description: 测试json文件子对象
* @author: aries
* @date: 2019-02-20 11:16
* @email: zbl686868@126.com
* @phone: 17611305537
*/
public class Step {
    private final Integer loop;
    private final String name;
    private final String operation;
    private final String url;
    private JsonNode request;
    private JsonNode assertions;


    public Integer getLoop() {
        return loop;
    }

    public String getName() {
        return name;
    }

    public String getOperation() {
        return operation;
    }

    public String getUrl() {
        return url;
    }

    public JsonNode getRequest() {
        return request;
    }

    public JsonNode getAssertions() {
        return assertions;
    }

    @JsonCreator
    public Step(
            @JsonProperty("stepLoop") Integer loop,
            @JsonProperty("name") String name,
            @JsonProperty("operation") String operation,
            @JsonProperty("url") String url,
            @JsonProperty("request") JsonNode request,
            @JsonProperty("assertions") JsonNode assertions) {
        this.loop = loop;
        this.name = name;
        this.operation = operation;
        this.request = request;
        this.url = url;
        this.assertions = assertions;
    }

    @Override
    public String toString() {
        return "Step{" +
                "stepLoop=" + loop +
                ", name='" + name + '\'' +
                ", operation='" + operation + '\'' +
                ", url='" + url + '\'' +
                ", request=" + request +
                ", assertions=" + assertions +
                '}';
    }
}
