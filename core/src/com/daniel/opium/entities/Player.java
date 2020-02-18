package com.daniel.opium.entities;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.daniel.opium.singletons.KeyboardEventListener;

public class Player extends Entity {
    KeyboardEventListener keyboardEventListener = KeyboardEventListener.getInstance();
    float xMoveDistance = (float) 11;
    float yMoveDistance = (float) 9.5;
    public Player() {
        super(BodyDef.BodyType.DynamicBody);
        setTexture(new Texture("characters/Adventurer-1.5/Individual-Sprites/adventurer-idle-00.png"));
        //add keyboard listeners
        //keyboardEventListener.addListener(Input.Keys.A, this::moveLeft);
        //keyboardEventListener.addListener(Input.Keys.D, this::moveRight);
        //keyboardEventListener.addListener(Input.Keys.W, this::moveUp);
        //keyboardEventListener.addListener(Input.Keys.S, this::moveDown);
    }
    //
    //private void moveLeft() {
    //    setX(getX() - xMoveDistance);
    //}
    //private void moveRight() {
    //    setX(getX() + xMoveDistance);
    //}
    //private void moveUp() {
    //    setY(getY() + yMoveDistance);
    //}
    //private void moveDown() {
    //    setY(getY() - yMoveDistance);
    //}
}
