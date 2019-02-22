package org.jsmart.zerocode.core.domain.reports;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;
/*
* @Description: 执行结果
* @author: aries
* @date: 2019-02-21 15:57
* @email: zbl686868@126.com
* @phone: 17611305537
*/
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ZeroCodeExecResult {
    private String scenarioName;
    private Integer loop;
    private List<ZeroCodeReportStep> steps = new ArrayList<>();

    @JsonCreator
    public ZeroCodeExecResult(
            @JsonProperty("scenarioName")String scenarioName,
            @JsonProperty("stepLoop")Integer loop,
            @JsonProperty("steps")List<ZeroCodeReportStep> steps) {
        this.scenarioName = scenarioName;
        this.loop = loop;
        this.steps = steps;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public Integer getLoop() {
        return loop;
    }

    public List<ZeroCodeReportStep> getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return "ZeroCodeExecResult{" +
                "scenarioName='" + scenarioName + '\'' +
                ", stepLoop=" + loop +
                ", steps=" + steps +
                '}';
    }
}
