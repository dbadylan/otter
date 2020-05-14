package com.alibaba.otter.node.etl.select.selector;

import java.util.HashMap;
import java.util.Map;

/**
 * 标记被截断的 binlog 的回环属性
 * pipelineId 为纬度，避免一个 node 多条 pipeline 的线程安全问题
 */
public class RetlMarker {

    // 标记 isLoopback 是否回环数据属性，默认 false
    public static Map<Long, Boolean> isLoopback = new HashMap<Long, Boolean>();

    // 标记 needLoopback 是否需要回环，相同 channelid 且符合单向回环特征的 binlog 才需要回环，默认 false
    public static Map<Long, Boolean> needLoopback = new HashMap<Long, Boolean>();

}