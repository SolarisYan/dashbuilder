/**
 * Copyright (C) 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.displayer;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class MeterChartDisplayerSettings extends AbstractChartDisplayerSettings {

    protected long meterStart;
    protected long meterWarning;
    protected long meterCritical;
    protected long meterEnd;

    @Override
    public DataDisplayerType getType() {
        return DataDisplayerType.METERCHART;
    }

    public long getMeterStart() {
        return meterStart;
    }

    public void setMeterStart(long meterStart) {
        this.meterStart = meterStart;
    }

    public long getMeterWarning() {
        return meterWarning;
    }

    public void setMeterWarning(long meterWarning) {
        this.meterWarning = meterWarning;
    }

    public long getMeterCritical() {
        return meterCritical;
    }

    public void setMeterCritical(long meterCritical) {
        this.meterCritical = meterCritical;
    }

    public long getMeterEnd() {
        return meterEnd;
    }

    public void setMeterEnd(long meterEnd) {
        this.meterEnd = meterEnd;
    }
}