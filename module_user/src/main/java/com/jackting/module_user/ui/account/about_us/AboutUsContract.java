package com.jackting.module_user.ui.account.about_us;

import com.jackting.common.base.interfaces.IModel;
import com.jackting.common.base.interfaces.IView;


public interface AboutUsContract {

    interface View extends IView{
        void loginSuccess();
    }

    interface Model extends IModel{
//        Observable<HttpRespResult<UserEntity>> login(String name, String pwd);
    }

}
