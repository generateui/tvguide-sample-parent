package com.acme.gwt.client;

import com.google.gwt.core.client.RunAsyncCallback;

import static com.google.gwt.user.client.Window.alert;

/**
 * all the crap that needs big java imports begins polluting the heap here.
 * <p/>
 * Created by IntelliJ IDEA.
 * User: jim
 * Date: 3/11/11
 * Time: 4:24 AM
 * To change this template use File | Settings | File Templates.
 */
class TvGuideApp implements RunAsyncCallback {
  @Override
  public void onFailure(Throwable reason) {
    //todo: review for a purpose
  }

  @Override
  public void onSuccess() {

    alert("you made it.");
  }


}
