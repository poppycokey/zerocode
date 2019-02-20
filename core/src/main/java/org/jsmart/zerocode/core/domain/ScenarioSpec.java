package org.jsmart.zerocode.core.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
/*
* @Description: 测试json文件对象
* @author: aries
* @date: 2019-02-20 11:15
* @email: zbl686868@126.com
* @phone: 17611305537
*/
public class ScenarioSpec {

    private final Integer loop;
    private final Boolean ignoreStepFailures;
    private final String scenarioName;
    private final List<Step> steps;
    /*
    * @Description: 测试json对象构造函数
    * @author: aries
    * @date: 2019-02-20 11:18
    * @email: zbl686868@126.com
    * @phone: 17611305537
    */
    @JsonCreator
    public ScenarioSpec(
            @JsonProperty("stepLoop") Integer loop,
            @JsonProperty("ignoreStepFailures") Boolean ignoreStepFailures,
            @JsonProperty("scenarioName") String scenarioName,
            @JsonProperty("steps") List<Step> steps) {
        this.loop = loop;
        this.ignoreStepFailures = ignoreStepFailures;
        this.scenarioName = scenarioName;
        this.steps = steps;
    }

    public Integer getLoop() {
        return loop;
    }

    public Boolean getIgnoreStepFailures() {
        return ignoreStepFailures;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public List<Step> getSteps() {
        return steps == null? (new ArrayList<>()) : steps;
    }

    @Override
    public String toString() {
        return "ScenarioSpec{" +
                "loop=" + loop +
                ", ignoreStepFailures=" + ignoreStepFailures +
                ", scenarioName='" + scenarioName + '\'' +
                ", steps=" + steps +
                '}';
    }
}
