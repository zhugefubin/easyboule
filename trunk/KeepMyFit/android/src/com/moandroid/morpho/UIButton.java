package com.moandroid.morpho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class UIButton extends View {

	public static void CreateButtonWithType(int buttonType){
		//TODO: need implement
	}
	
	public UIButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public UIButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public UIButton(Context context) {
		super(context);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
	}
	
	
	public Drawable getBackgroundImageForState(int controlState){
		//TODO: need implement
		return null;
	}
	
	public Rect getBackgroundRectForBounds(Rect bounds){
		//TODO: need implement
		return null;
	}
	
	public Rect getContentRectForBounds(Rect bounds){
		//TODO: need implement
		return null;
	}
	
	public Drawable getImageForState(int constrolState){
		//TODO: need implement
		return null;
	}
	
	
	
}
