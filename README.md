# BlurPopupWindow/高级模糊Pop弹窗




如何使用?  How to use?<br>

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



