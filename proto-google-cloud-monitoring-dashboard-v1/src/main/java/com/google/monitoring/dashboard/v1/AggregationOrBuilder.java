/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/common.proto

package com.google.monitoring.dashboard.v1;

public interface AggregationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.Aggregation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The alignment period for per-[time series][TimeSeries]
   * alignment. If present, `alignmentPeriod` must be at least 60
   * seconds.  After per-time series alignment, each time series will
   * contain data points only on the period boundaries. If
   * `perSeriesAligner` is not specified or equals `ALIGN_NONE`, then
   * this field is ignored. If `perSeriesAligner` is specified and
   * does not equal `ALIGN_NONE`, then this field must be defined;
   * otherwise an error is returned.
   * </pre>
   *
   * <code>.google.protobuf.Duration alignment_period = 1;</code>
   *
   * @return Whether the alignmentPeriod field is set.
   */
  boolean hasAlignmentPeriod();
  /**
   *
   *
   * <pre>
   * The alignment period for per-[time series][TimeSeries]
   * alignment. If present, `alignmentPeriod` must be at least 60
   * seconds.  After per-time series alignment, each time series will
   * contain data points only on the period boundaries. If
   * `perSeriesAligner` is not specified or equals `ALIGN_NONE`, then
   * this field is ignored. If `perSeriesAligner` is specified and
   * does not equal `ALIGN_NONE`, then this field must be defined;
   * otherwise an error is returned.
   * </pre>
   *
   * <code>.google.protobuf.Duration alignment_period = 1;</code>
   *
   * @return The alignmentPeriod.
   */
  com.google.protobuf.Duration getAlignmentPeriod();
  /**
   *
   *
   * <pre>
   * The alignment period for per-[time series][TimeSeries]
   * alignment. If present, `alignmentPeriod` must be at least 60
   * seconds.  After per-time series alignment, each time series will
   * contain data points only on the period boundaries. If
   * `perSeriesAligner` is not specified or equals `ALIGN_NONE`, then
   * this field is ignored. If `perSeriesAligner` is specified and
   * does not equal `ALIGN_NONE`, then this field must be defined;
   * otherwise an error is returned.
   * </pre>
   *
   * <code>.google.protobuf.Duration alignment_period = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getAlignmentPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * The approach to be used to align individual time series. Not all
   * alignment functions may be applied to all time series, depending
   * on the metric type and value type of the original time
   * series. Alignment may change the metric type or the value type of
   * the time series.
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `crossSeriesReducer` is specified, then
   * `perSeriesAligner` must be specified and not equal `ALIGN_NONE`
   * and `alignmentPeriod` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Aggregation.Aligner per_series_aligner = 2;</code>
   *
   * @return The enum numeric value on the wire for perSeriesAligner.
   */
  int getPerSeriesAlignerValue();
  /**
   *
   *
   * <pre>
   * The approach to be used to align individual time series. Not all
   * alignment functions may be applied to all time series, depending
   * on the metric type and value type of the original time
   * series. Alignment may change the metric type or the value type of
   * the time series.
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `crossSeriesReducer` is specified, then
   * `perSeriesAligner` must be specified and not equal `ALIGN_NONE`
   * and `alignmentPeriod` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Aggregation.Aligner per_series_aligner = 2;</code>
   *
   * @return The perSeriesAligner.
   */
  com.google.monitoring.dashboard.v1.Aggregation.Aligner getPerSeriesAligner();

  /**
   *
   *
   * <pre>
   * The approach to be used to combine time series. Not all reducer
   * functions may be applied to all time series, depending on the
   * metric type and the value type of the original time
   * series. Reduction may change the metric type of value type of the
   * time series.
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `crossSeriesReducer` is specified, then
   * `perSeriesAligner` must be specified and not equal `ALIGN_NONE`
   * and `alignmentPeriod` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Aggregation.Reducer cross_series_reducer = 4;</code>
   *
   * @return The enum numeric value on the wire for crossSeriesReducer.
   */
  int getCrossSeriesReducerValue();
  /**
   *
   *
   * <pre>
   * The approach to be used to combine time series. Not all reducer
   * functions may be applied to all time series, depending on the
   * metric type and the value type of the original time
   * series. Reduction may change the metric type of value type of the
   * time series.
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `crossSeriesReducer` is specified, then
   * `perSeriesAligner` must be specified and not equal `ALIGN_NONE`
   * and `alignmentPeriod` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Aggregation.Reducer cross_series_reducer = 4;</code>
   *
   * @return The crossSeriesReducer.
   */
  com.google.monitoring.dashboard.v1.Aggregation.Reducer getCrossSeriesReducer();

  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `crossSeriesReducer` is
   * specified. The `groupByFields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * function. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `crossSeriesReducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `groupByFields` are aggregated away.  If
   * `groupByFields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `crossSeriesReducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   *
   * @return A list containing the groupByFields.
   */
  java.util.List<java.lang.String> getGroupByFieldsList();
  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `crossSeriesReducer` is
   * specified. The `groupByFields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * function. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `crossSeriesReducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `groupByFields` are aggregated away.  If
   * `groupByFields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `crossSeriesReducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   *
   * @return The count of groupByFields.
   */
  int getGroupByFieldsCount();
  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `crossSeriesReducer` is
   * specified. The `groupByFields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * function. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `crossSeriesReducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `groupByFields` are aggregated away.  If
   * `groupByFields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `crossSeriesReducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The groupByFields at the given index.
   */
  java.lang.String getGroupByFields(int index);
  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `crossSeriesReducer` is
   * specified. The `groupByFields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * function. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `crossSeriesReducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `groupByFields` are aggregated away.  If
   * `groupByFields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `crossSeriesReducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the groupByFields at the given index.
   */
  com.google.protobuf.ByteString getGroupByFieldsBytes(int index);
}