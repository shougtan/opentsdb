// This file is part of OpenTSDB.
// Copyright (C) 2021  The OpenTSDB Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package net.opentsdb.query.anomaly;

/**
 * An interface to anomaly prediction jobs that run in a queue.
 * 
 * @since 3.0
 */
public interface AnomalyPredictionJob extends Runnable {

  /**
   * The threshold used to determine if the job is "big" or "smallish".
   * @return A value of 0 or greater.
   */
  public int jobThreshold();
  
}