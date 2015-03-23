# Introduction #
在项目过程中，常常需要给客户演示软件在真机上的运行效果，录制视频是一种很好的方法。本项目的目标是针对Anroid手机上开发一款屏幕录制软件。

# Members #

  * zhuangtaizzt@gmail.com
  * wangzongjunvip@163.com

# Motivation #
  * 在项目开发过程中，项目人员常常需要给客户演示软件开发的进度。播放录制视频是一种很好的演示手段，既可以直观的展示成果，减少构建运行环境的过程，同时由于不直接接触程序和源码，保证了开发方的版权利益；
  * 在项目的测试过程中，测试人员常常需要给开发人员重现bug出现的过程。提供当时操作的视频，可以方便快速的让开发人员发现bug的问题所在；
  * 在项目的测试过程中，测试人员不可能时时刻刻守在测试机器前，所以对自动化测试过程进行录制，可以提高测试效率；

# Solution #
  * PC机上方案：
  * 在SDK中，自带的ddms工具可以连接手机设备并且进行截屏。开发者可以通过使用自带的ddmlib实现相同的功能；
  * 首先通过定时截屏功能录制手机屏幕的变化；然后再将所有的图片连接成一段视频。
  * 手机上方案：
  * 由于Android的内核是一个定制版本的Linux系统，其中framebuffer是linux内核对显示的最底层驱动。在一般的linux文件系统中，通过/dev/fb0设备文件来提供给应用程序对framebuffer进行读写的访问。在Android系统中，这个设备文件被放在了/dev/graphics/fb0
  * 读取的方法很简单，就将/dev/graphics/fb0当作一般的文件读取即可。可以通过ioctl()方法获取图像的长宽，以及每一个pixel对应的数据量。在Android系统中，采用的是rbg565的编码方式。
  * 从Android系统中读取原生数据后，可以使用ffmpeg转化成我们需要的格式。
  * 问题：获取framebuffer数据命令需要root权限；ffmpeg需要制作android版本。
  * 参考资料：
  * 开源项目 http://code.google.com/p/android-screenshot-library/source/checkout
  * blog: http://my.opera.com/otaku_2r/blog/grab-a-frame-in-android-frame-buffer
  * http://xzpeter.org/?p=229

# Architecture #
![https://lh5.googleusercontent.com/-20TScQCd7n8/T6NWvAbB74I/AAAAAAAAAKU/_T058AKi3kI/s640/AndroidScreen.jpg](https://lh5.googleusercontent.com/-20TScQCd7n8/T6NWvAbB74I/AAAAAAAAAKU/_T058AKi3kI/s640/AndroidScreen.jpg)