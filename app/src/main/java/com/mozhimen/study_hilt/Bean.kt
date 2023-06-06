package com.mozhimen.study_hilt

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

/**
 * @ClassName Bean
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/6/6 1:12
 * @Version 1.0
 */
@ActivityScoped
class Bean constructor(val name: String) {
    @Inject
    constructor() : this("123")
}