//----------------------------------------------------------------------------//
//                                                                            //
//                              E x c l u s i o n                             //
//                                                                            //
//----------------------------------------------------------------------------//
// <editor-fold defaultstate="collapsed" desc="hdr">                          //
//  Copyright © Herve Bitteur and others 2000-2013. All rights reserved.      //
//  This software is released under the GNU General Public License.           //
//  Goto http://kenai.com/projects/audiveris to report bugs or suggestions.   //
//----------------------------------------------------------------------------//
// </editor-fold>
package omr.sig;


/**
 * Interface {@code Exclusion} is a relation that indicates exclusion
 * between two possible interpretations.
 *
 * @author Hervé Bitteur
 */
public interface Exclusion
    extends Relation
{
    public enum Cause
    {
        OVERLAP,
        TOO_CLOSE,
        INCOMPATIBLE;
    }
}
