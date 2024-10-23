package io.github.relasim;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public class Player {

    // player properties
    Vector2 position; // position of the tip of the player
    Vector2 velocity;
    Vector2 acceleration;

    public Player(Vector2 position, Vector2 velocity, Vector2 acceleration) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
    }

    public void render(ShapeRenderer shapeRenderer) {
        // render player
        shapeRenderer.end(); // end the previous shapeRenderer.begin() call
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(0, 1, 1, 1);
        shapeRenderer.triangle(position.x, position.y, position.x - 10, position.y - 20, position.x + 10, position.y - 20);
    }

    /**
     * Updates the player's position based on the current velocity and acceleration.
     * @param delta The time step in seconds.
     */
    public void update(float delta) {
        velocity.add(acceleration.cpy().scl(delta)); // v = u + at
        position.add(velocity.cpy().scl(delta)); // s = ut + 0.5at^2
    }

    /**
     * Returns the player's position.
     * @return The player's position.
     */
    public Vector2 getPosition(){
        return position;
    }

    /**
     * Returns the player's velocity.
     * @return The player's velocity.
     */
    public Vector2 getVelocity(){
        return velocity;
    }

    /**
     * Returns the player's acceleration.
     * @return The player's acceleration.
     */
    public Vector2 getAcceleration(){
        return acceleration;
    }

    /**
     * Sets the player's position.
     * @param position The new position.
     */
    public void setPosition(Vector2 position){
        this.position = position;
    }

    /**
     * Sets the player's velocity.
     * @param velocity The new velocity.
     */
    public void setVelocity(Vector2 velocity){
        this.velocity = velocity;
    }

    /**
     * Sets the player's acceleration.
     * @param acceleration The new acceleration.
     */
    public void setAcceleration(Vector2 acceleration){
        this.acceleration = acceleration;
    }

    /**
     * Applies a force to the player.
     * @param force The force to apply.
     */
    public void applyForce(Vector2 force){
        acceleration.add(force);
    }

    /**
     * Applies an impulse to the player.
     * @param impulse The impulse to apply.
     */
    public void applyImpulse(Vector2 impulse){
        velocity.add(impulse);
    }
}
