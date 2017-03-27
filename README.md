# BlurPopupWindow/高级模糊Pop弹窗<br>

### 作者：王亟亟

### blog:http://blog.csdn.net/ddwhan0123

<br>
#### 效果图<br>

![](http://img.blog.csdn.net/20160730214925858)  
<br>
![](http://img.blog.csdn.net/20160730214936983)  
<br>
公共Maven会在完成下次更新后补上<br>


如何使用?  <br>

    new BlurPopWin.Builder(MainActivity.this).setContent("该配合你演出的我,眼视而不见,在比一个最爱你的人即兴表演")
                        //Radius越大耗时越长,被图片处理图像越模糊
                        .setRadius(3).setTitle("我是标题")
                        //设置居中还是底部显示
                        .setshowAtLocationType(0)
                        .onClick(new BlurPopWin.PopupCallback() {
                            @Override
                            public void onClick(@NonNull BlurPopWin blurPopWin) {
                                Toast.makeText(MainActivity.this, "中间被点了", Toast.LENGTH_SHORT).show();
                                blurPopWin.dismiss();
                            }
                        }).show(btn);
在需要显示pop的地方直接new 一个实例出来然后简单的走一下各类set最后.show就行，灰常的简单<br>

v1.0 可配置的方法<br>

设置标题 setTitle(@StringRes int titleRes);<br>

设置图片处理锐化程度 setRadius(int radius);<br>

设置标题字体大小 setTitleTextSize(int size);<br>

设置内容文字 setContent(@StringRes int contentRes;<br>

设置内容字体大小 setContentTextSize(int size);<br>

设置pop位置 setshowAtLocationType(int type);<br>//0为居中，1为底部

设置是否显示关闭按钮 setShowCloseButton(@NonNull boolean flag)

设置外部是否可点击 setOutSideClickable(@NonNull boolean flag)

--------------------------

谢谢各位观众老爷




