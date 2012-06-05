/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg;

import org.apache.commons.lang.StringEscapeUtils;
import sun.swing.StringUIClientPropertyKey;

/**
 *
 * @author Roy Braam
 */
public class Link implements Comparable {
    private String ahref=null;
    private String label=null;

    public Link(String ahref, String label){
        this.setAhref(ahref);
        this.setLabel(label);
    }
    @Override
    public int compareTo(Object o) {
        if (o==null || !(o instanceof Link)){
            return 1;
        }else{
            Link l1 = (Link)o;
            if (this.getLabel()==null){
                return -1;
            }else{
                return this.getLabel().compareToIgnoreCase(l1.getLabel());
            }
        }
    }

    public String getAhref() {
        return ahref;
    }

    public void setAhref(String ahref) {
        this.ahref = ahref;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    @Override
    public String toString(){  
        String s = "<a href='"+StringEscapeUtils.escapeHtml(this.getAhref())+"'>";
        if (this.getLabel()!=null){
            s+=StringEscapeUtils.escapeHtml(this.getLabel());
        }else{
            s+=StringEscapeUtils.escapeHtml(this.getAhref());
        }
        s+="</a>";
        return s;
    }
}
