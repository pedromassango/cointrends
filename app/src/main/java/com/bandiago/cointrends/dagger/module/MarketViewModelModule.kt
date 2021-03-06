/*
 * Copyright (c) 2018 Bandiago
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bandiago.cointrends.dagger.module

import com.bandiago.cointrends.datamodel.MarketRepository
import com.bandiago.cointrends.datamodel.interactor.DbInteractor
import com.bandiago.cointrends.datamodel.interactor.HttpInteractor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MarketViewModelModule {

    @Singleton
    @Provides
    fun providesMarketDataModel(dbInteractor: DbInteractor, httpInteractor: HttpInteractor): MarketRepository {
        return  MarketRepository(dbInteractor, httpInteractor)
    }

}