package org.trevreport.gamepro

import org.apache.cordova.DroidGap
import android.os.Bundle
import android.view.Menu

class MainActivity extends DroidGap {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    super.loadUrl("file:///android_asset/www/index.html")
  }
}