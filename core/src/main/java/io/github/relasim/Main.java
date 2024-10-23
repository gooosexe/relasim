package io.github.relasim;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private ShapeRenderer shapeRenderer;
    private Player player;

    /**
     * Called when the {@link ApplicationAdapter} is first created.
     */
    @Override
    public void create() {
        shapeRenderer = new ShapeRenderer();
        player = new Player(new Vector2(100, 100), new Vector2(0, 0), new Vector2(0, -9.8f));
    }

    @Override
    public void render() {
        // render rectangle
        player.render(shapeRenderer);
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }
}
