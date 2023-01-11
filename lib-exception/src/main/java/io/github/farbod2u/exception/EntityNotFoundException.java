package io.github.farbod2u.exception;

/***
 * @author Saeed Safaeian
 */
public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException() {
        super("Entity not found.");
    }
}
